import { User } from "./UserModel";
import { AttributeModel } from "./AttributeModel";
import { PlateModel } from "./PlateModel";

export interface PatternModel {
  id: number;
  title: string;
  description: string;
  user: User;
  date: string;
  frequency: number;
  isActive: boolean;
  plate: PlateModel[];
  attributes: AttributeModel[];
}
