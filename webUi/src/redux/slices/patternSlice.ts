import { createSlice, PayloadAction } from "@reduxjs/toolkit";
import { PatternModel } from "../../models/PatternModel";
import { AttributeModel } from "../../models/AttributeModel";
import { PlateModel } from "./../../models/PlateModel";

const initialState: PatternModel = {
  id: 0,
  title: "",
  description: "",
  user: {
    id: 1,
    name: "admin",
    surname: "admin",
    email: "admin@admin.admin",
    isAdmin: true,
  },
  date: "",
  frequency: 0,
  isActive: false,
  plate: [],
  attributes: [],
};

export const patternSlice = createSlice({
  name: "Pattern",
  initialState: initialState,
  reducers: {
    loadPattern: (state, action: PayloadAction<PatternModel>) => {
      console.log("action", action.payload);

      state = action.payload;
    },
    removePattern: (state) => (state = initialState),
    addAttributes: (state, action: PayloadAction<AttributeModel[]>) => {
      state.attributes = action.payload;
    },
    setPlates: (state, action: PayloadAction<PlateModel[]>) => {
      state.plate = action.payload;
    },
    setTitle: (state, action: PayloadAction<string>) => {
      state.title = action.payload;
    },
  },
});

export const patternReducer = patternSlice.reducer;
export const patternActions = patternSlice.actions;
