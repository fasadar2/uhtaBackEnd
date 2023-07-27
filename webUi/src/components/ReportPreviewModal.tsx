import React from "react";
import { useNavigate } from "react-router-dom";
import { useDispatch } from "react-redux";
import { AppDispatch } from "../redux/store";
import Modal from "@mui/material/Modal";
import Box from "@mui/material/Box";
import {
  Table,
  TableBody,
  TableCell,
  TableContainer,
  TableHead,
  TableRow,
  Typography,
} from "@mui/material";
import Button from "@mui/material/Button";
import SaveReportModal from "./SaveReportModal";
import { AttributeModel } from "../models/AttributeModel";
import { PlateModel } from "../models/PlateModel";

interface PreviewProps {
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
  width: "auto",
  bgcolor: "background.paper",
  border: "2px solid #000",
  boxShadow: 24,
  p: 4,
  display: "flex",
  flexDirection: "column",
  alignItems: "center",
};

function ReportPreviewModal(props: PreviewProps) {
  console.log(props);

  const [saveReportOpen, setSaveReportOpen] = React.useState(false);
  const handleSaveReportOpen = () => {
    setSaveReportOpen(true);
  };

  const [open, setOpen] = React.useState(false);
  const handleOpen = () => setOpen(true);
  const navigate = useNavigate();
  const handleClose = () => props.handlerClose();
  const dispatch = useDispatch<AppDispatch>();

  const rows = ["Контур 1", "Контур 2", "Контур 3", "Контур 4", "Контур 5"];

  // function rand(min: number, max: number): number {
  //   let res = min + (Math.random() % (max + 1 - min));
  //   res = Math.round(res * 10);
  //   console.log(res);

  //   return res;
  // }

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
            Предпросмотр
          </Typography>
          <Box
            sx={{
              border: "1px solid black",
            }}
          >
            <TableContainer>
              <Table>
                <TableHead>
                  <TableRow>
                    <TableCell>Контур</TableCell>
                    <TableCell align="right">Установка</TableCell>
                    {props.attributes.map((attribute) => (
                      <TableCell align="right" key={attribute.id}>
                        {attribute.title}
                      </TableCell>
                    ))}
                  </TableRow>
                </TableHead>
                <TableBody>
                  {/* {rows.map((row) => (
                    <TableRow
                      key={row}
                      sx={{ "&:last-child td, &:last-child th": { border: 0 } }}
                    >
                      <TableCell component="th" scope="row">
                        {row}
                      </TableCell>
                      <TableCell component="th" scope="row">
                        {props.plates[rand(0, props.plates.length - 1)]}
                      </TableCell>
                      {props.attributes.forEach((a) => (
                        <TableCell component="th" scope="row" key={a.id}>
                          {rand(0, 10)}
                        </TableCell>
                      ))}
                    </TableRow>
                  ))} */}
                </TableBody>
              </Table>
            </TableContainer>
          </Box>

          <Box
            sx={{
              display: "flex",
              justifyContent: "space-between",
              width: "50%",
              mt: 5,
            }}
          >
            {/* <Button
              onClick={() => {
                handleClose();
                handleSaveReportOpen();
              }}
              variant="contained"
            >
              Сохранить отчет
            </Button> */}
            <Button onClick={handleClose} variant="contained">
              Закрыть
            </Button>
          </Box>
        </Box>
      </Modal>
      <SaveReportModal
        open={saveReportOpen}
        handlerClose={() => setSaveReportOpen(false)}
      />
    </>
  );
}
export default ReportPreviewModal;
