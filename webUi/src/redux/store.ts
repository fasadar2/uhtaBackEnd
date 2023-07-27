import { configureStore } from "@reduxjs/toolkit";
import { clientReducer } from "./slices/clientslice";
import { attributeReducer } from "./reducers/atrributeReducer";
import { patternReducer } from "./slices/patternSlice";

export const store = configureStore({
  reducer: {
    client: clientReducer,
    pattern: patternReducer,
    attributes: attributeReducer,
  },
});

export type RootState = ReturnType<typeof store.getState>;
export type AppDispatch = typeof store.dispatch;
