import {Http} from '@angular/http';
import {Injectable} from '@angular/core';
import 'rxjs/add/operator/map';

@Injectable()
export class ActorsService {

  constructor(private http: Http) {
  }

  getActors() {
    return this.http.get('http://localhost:8081/api/actor/all')
      .map(function (response) {
        console.log(response)
        return response.json();
      });
  }

}
