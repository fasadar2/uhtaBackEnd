import { createAction } from "@reduxjs/toolkit";

export const loadPatternFail = createAction("LOADED_FAIL");
export const loadPatternSuccess = createAction("LOADED_SUCCESS");
export const removePattern = createAction("REMOVE_PATTERN");
export const setTitle = createAction("SET_TTILE");
export const addAttributes = createAction("ADD_ATTRIBUTES");
export const setPlates = createAction("SET_PLATES");
