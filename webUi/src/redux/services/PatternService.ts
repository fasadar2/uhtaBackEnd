import axios from "axios";
import { PatternModel } from "../../models/PatternModel";
import { ReportModel } from "../../models/ReportModel";
import { Observable } from "rxjs";
import { AjaxResponse, ajax } from "rxjs/ajax";

const API_URL = "api/pattern/";
class PatternService {
  getPatterns() {
    const patterns: Observable<AjaxResponse<PatternModel[]>> = ajax(
      API_URL + "get-patterns"
    );

    return patterns;
  }

  addPattern(data: PatternModel) {
    axios.post(API_URL + "add-pattern", data).then((res) => {});
  }

  makeReport(data: ReportModel) {
    axios.post(API_URL + "report", data).then((res) => {});
  }
}
export default new PatternService();
