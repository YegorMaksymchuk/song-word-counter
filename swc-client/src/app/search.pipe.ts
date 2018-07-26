import {Pipe, PipeTransform} from '@angular/core';
import 'rxjs/add/operator/map';

@Pipe({
  name: 'search'
})
export class SearchPipe implements PipeTransform {

  transform(response, value) {
    return response.filter(actor =>{
      return actor.name.toUpperCase().includes(value.toUpperCase());
    });
  }
}
