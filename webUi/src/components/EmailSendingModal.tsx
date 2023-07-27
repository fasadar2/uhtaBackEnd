import React from "react";
import { useNavigate } from "react-router-dom";
import { useDispatch } from "react-redux";
import { AppDispatch } from "../redux/store";
import Modal from "@mui/material/Modal";
import Box from "@mui/material/Box";
import { Typography } from "@mui/material";
import TextField from "@mui/material/TextField";
import Button from "@mui/material/Button";
import Container from "@mui/material/Container";
import { AttributeModel } from "../models/AttributeModel";
import { ReportModel } from "../models/ReportModel";
import PatternService from "../redux/services/PatternService";
import { PlateModel } from "../models/PlateModel";
import { AdapterDayjs } from "@mui/x-date-pickers-pro/AdapterDayjs";
import { DatePicker, LocalizationProvider } from "@mui/x-date-pickers-pro";
import { Dayjs } from "dayjs";

interface EmailProps {
  open: boolean;
  handlerClose: () => void;

  plates: PlateModel[];
  attributes: AttributeModel[];
}

const style = {
  position: "absolute" as "absolute",
  top: "50%",
  left: "50%",
  transform: "translate(-50%, -50%)",
  width: 500,
  bgcolor: "background.paper",
  border: "2px solid #000",
  boxShadow: 24,
  p: 4,
  display: "flex",
  flexDirection: "column",
  alignItems: "center",
};

function EmailSendingModal(props: EmailProps) {
  const emailbox = React.useRef<HTMLInputElement>(null);
  const [open, setOpen] = React.useState(false);
  const [emails, setEmails] = React.useState<string[]>([]);
  const [startDate, setStartDate] = React.useState<Dayjs | null>(null);
  const [endDate, setEndDate] = React.useState<Dayjs | null>(null);

  const handleOpen = () => setOpen(true);
  const navigate = useNavigate();
  const handleClose = () => props.handlerClose();
  const dispatch = useDispatch<AppDispatch>();
  const addEmail = (email: string) => {
    if (email !== null && !emails.includes(email)) {
      const tmpEmails: string[] = [];
      emails.forEach((e) => tmpEmails.push(e));
      tmpEmails.push(email);
      setEmails(tmpEmails);
    }
  };

  const removeEmail = (email: string) => {
    setEmails((emails) => [...emails.filter((i) => i !== email)]);
  };

  const makeReport = (report: ReportModel) => {
    PatternService.makeReport(report);
  };

  const handleMakeReport = () => {
    const report: ReportModel = {
      plates: props.plates,
      attributes: props.attributes,
      emails: emails,
      dateStart: startDate!.format("YYYY-MM-DD [00:00]"), //"2023-02-01 00:00",
      dateFinish: endDate!.format("YYYY-MM-DD [00:00]"), //"2023-02-10 00:00",
    };

    console.log(report);

    makeReport(report);

    setOpen(false);
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
            Выберите период отчета
          </Typography>
          <LocalizationProvider dateAdapter={AdapterDayjs}>
            <Box
              sx={{
                mt: 2,
                mb: 2,
              }}
            >
              <DatePicker
                label="Начальная дата"
                inputFormat="DD/MM/YYYY" //"DD/MM/YYYY HH:MM"
                value={startDate}
                renderInput={(params) => <TextField {...params} />}
                onChange={(newValue: Dayjs | null) => {
                  setStartDate(newValue);
                }}
              />
            </Box>

            <DatePicker
              label="Конечная дата"
              inputFormat="DD/MM/YYYY"
              value={endDate}
              renderInput={(params) => <TextField {...params} />}
              onChange={(newValue: Dayjs | null) => {
                setEndDate(newValue);
              }}
            />
          </LocalizationProvider>
          <Typography
            mb={1}
            sx={{
              fontSize: "20px",
              textAlign: "center",
            }}
          >
            Введите Email'ы
          </Typography>
          <TextField
            inputRef={emailbox}
            type="email"
            id="email"
            label="Email"
            sx={{
              mt: 2,
              mb: 2,
            }}
          ></TextField>
          <Button
            onClick={() => {
              addEmail(emailbox!.current!.value);
            }}
            variant="contained"
          >
            Добавить
          </Button>
          <Typography
            mb={1}
            sx={{
              fontSize: "20px",
              textAlign: "center",
            }}
          >
            Выбранные адреса
          </Typography>
          <Container
            sx={{
              border: "1px solid black",
              borderRadius: "10px",
              mt: 2,
              mb: 2,
            }}
          >
            {emails.map((email) => (
              <Box
                sx={{
                  display: "flex",
                  justifyContent: "space-between",
                }}
              >
                <Typography
                  mb={1}
                  sx={{
                    fontSize: "20px",
                    textAlign: "center",
                  }}
                >
                  {email}
                </Typography>
                <Button
                  onClick={() => {
                    removeEmail(email);
                  }}
                  color="error"
                >
                  Удалить
                </Button>
              </Box>
            ))}
          </Container>
          <Button onClick={handleMakeReport} variant="contained">
            Сохранить
          </Button>
        </Box>
      </Modal>
    </>
  );
}
export default EmailSendingModal;
