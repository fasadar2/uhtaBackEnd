import { PlateModel } from "../../models/PlateModel";
import { ajax, AjaxResponse } from "rxjs/ajax";
import { Observable } from "rxjs";

const API_URL = "http://localhost:8090/attribute/";
class PlateService {
  getPlates() {
    const plates: Observable<AjaxResponse<PlateModel[]>> = ajax(
      API_URL + "get-plates"
    );
    return plates;
  }
}
export default new PlateService();
