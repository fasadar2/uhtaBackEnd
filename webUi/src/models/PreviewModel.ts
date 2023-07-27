import { AttributeModel } from "./AttributeModel";
import { PlateModel } from "./PlateModel";

export interface PreviewModal {
  title: string;
  plate: PlateModel;
  attributes: AttributeModel[];
}

export interface PreviewDataModel {
  attribute: AttributeModel;
  value: string[];
}
