import React from "react";
import { useNavigate } from "react-router-dom";
import { useDispatch } from "react-redux";
import { AppDispatch } from "../redux/store";
import Modal from "@mui/material/Modal";
import Box from "@mui/material/Box";
import { Typography } from "@mui/material";
import Button from "@mui/material/Button";
import TextField from "@mui/material/TextField";
import { PatternModel } from "../models/PatternModel";
import { AttributeModel } from "../models/AttributeModel";
import { PlateModel } from "../models/PlateModel";
import PatternService from "../redux/services/PatternService";

interface PatternProps {
  open: boolean;
  handlerClose: () => void;

  attributes: AttributeModel[];
  plates: PlateModel[];
}

const style = {
  position: "absolute" as "absolute",
  top: "50%",
  left: "50%",
  transform: "translate(-50%, -50%)",
  width: 400,
  bgcolor: "background.paper",
  border: "2px solid #000",
  boxShadow: 24,
  p: 4,
  display: "flex",
  flexDirection: "column",
  alignItems: "center",
};

function SavePatternModal(props: PatternProps) {
  const titleBox = React.useRef<HTMLInputElement>(null);
  const [open, setOpen] = React.useState(false);
  const [title, setTitle] = React.useState("");

  const handleOpen = () => setOpen(true);
  const navigate = useNavigate();
  const handleClose = () => {
    props.handlerClose();
  };
  const dispatch = useDispatch<AppDispatch>();

  const savePattern = (pattern: PatternModel) => {
    PatternService.addPattern(pattern);
  };

  const handleSave = () => {
    setTitle(titleBox!.current!.value);
    const pattern: PatternModel = {
      id: 0,
      title: title,
      description: "",
      date: Date.now().toString(),
      frequency: 0,
      user: {
        id: 1,
        name: "admin",
        surname: "admin",
        email: "admin@admin.admin",
        isAdmin: true,
      },
      isActive: false,
      plate: props.plates,
      attributes: props.attributes,
    };

    savePattern(pattern);
  };

  return (
    <>
      <Modal
        open={props.open}
        onClose={handleClose}
        aria-labelledby="modal-modal-title"
        aria-describedby="modal-modal-description"
      >
        <Box sx={style}>
          <Typography
            mb={1}
            sx={{
              fontSize: "20px",
              textAlign: "center",
            }}
          >
            Введите название шаблона
          </Typography>
          <TextField
            inputRef={titleBox}
            label="Название шаблона"
            sx={{
              mt: 2,
              mb: 2,
            }}
          ></TextField>
          <Button onClick={handleSave} variant="contained">
            Сохранить
          </Button>
        </Box>
      </Modal>
    </>
  );
}
export default SavePatternModal;
