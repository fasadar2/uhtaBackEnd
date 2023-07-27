import React from "react";
import Modal from "@mui/material/Modal";
import Box from "@mui/material/Box";
import { Typography } from "@mui/material";
import Button from "@mui/material/Button";
import { useNavigate } from "react-router-dom";
import { useDispatch } from "react-redux";
import { AppDispatch } from "../redux/store";
import InputLabel from "@mui/material/InputLabel";
import Select, { SelectChangeEvent } from "@mui/material/Select";
import MenuItem from "@mui/material/MenuItem";
import FormControl from "@mui/material/FormControl";
import PatternService from "../redux/services/PatternService";
import { PatternModel } from "../models/PatternModel";
import { useAppSelector } from "../Hooks";
import { patternActions } from "../redux/slices/patternSlice";

interface PatternProps {
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

function LoadPatternModal(props: PatternProps) {
  const pattern = useAppSelector((state) => state.pattern);
  const actions = useDispatch();

  const [open, setOpen] = React.useState(false);
  const handleOpen = () => setOpen(true);
  const navigate = useNavigate();
  const handleClose = () => props.handlerClose();
  const dispatch = useDispatch<AppDispatch>();
  const [patterns, setPatterns] = React.useState<PatternModel[]>();
  const [key, setKey] = React.useState<boolean>(false);

  React.useEffect(() => {
    if (key) return;
    const _patterns = PatternService.getPatterns();
    _patterns.subscribe({
      next: (_) => {
        const res = _.response;

        if (res) setPatterns(res);
      },
      error(err) {
        console.log("LoadPatternModal Error: ", err);
      },
    });
    setKey(true);
  }, [key]);

  const handleChange = (e: SelectChangeEvent<number>) => {
    patternActions.loadPattern(
      patterns!.filter((p) => p.id === e.target!.value!)[0]
    );
    console.log(pattern);
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
            Выберите шаблон
          </Typography>
          <FormControl
            sx={{
              width: "60%",
              mt: 2,
              mb: 2,
            }}
          >
            <InputLabel id="demo-simple-select-label">Шаблон</InputLabel>
            <Select
              labelId="demo-simple-select-label"
              id="demo-simple-select"
              label="Параметр"
              value={pattern == null || pattern === undefined ? 0 : pattern.id}
              onChange={handleChange}
            >
              {patterns ? (
                patterns.map((pattern) => (
                  <MenuItem value={pattern.id}>{pattern.title}</MenuItem>
                ))
              ) : (
                <MenuItem value="">
                  <em>None</em>
                </MenuItem>
              )}
            </Select>
          </FormControl>
          <Button onClick={handleClose} variant="contained">
            Выбрать
          </Button>
        </Box>
      </Modal>
    </>
  );
}
export default LoadPatternModal;
