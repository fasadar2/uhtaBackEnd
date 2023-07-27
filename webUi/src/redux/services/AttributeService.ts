import { Observable } from "rxjs";
import { AjaxResponse, ajax } from "rxjs/ajax";
import { PlateModel } from "../../models/PlateModel";

const API_URL = "http://localhost:8090/attribute/";
class AttributeService {
  getAttributes() {
    const attributes: Observable<AjaxResponse<PlateModel[]>> = ajax(
      API_URL + "get-attributes"
    );
    return attributes;
  }
}
export default new AttributeService();
