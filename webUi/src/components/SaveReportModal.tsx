import React from "react";
import { useNavigate } from "react-router-dom";
import { useDispatch } from "react-redux";
import { AppDispatch } from "../redux/store";
import Modal from "@mui/material/Modal";
import Box from "@mui/material/Box";
import Button from "@mui/material/Button";

interface SaveReportProps {
  open: boolean;
  handlerClose: () => void;
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

function SaveReportModal(props: SaveReportProps) {
  const [open, setOpen] = React.useState(false);
  const handleOpen = () => setOpen(true);
  const navigate = useNavigate();
  const handleClose = () => props.handlerClose();
  const dispatch = useDispatch<AppDispatch>();

  return (
    <>
      <Modal
        open={props.open}
        onClose={handleClose}
        aria-labelledby="modal-modal-title"
        aria-describedby="modal-modal-description"
      >
        <Box sx={style}>
          <Button onClick={handleClose} variant="contained">
            Сохранить
          </Button>
        </Box>
      </Modal>
    </>
  );
}
export default SaveReportModal;
