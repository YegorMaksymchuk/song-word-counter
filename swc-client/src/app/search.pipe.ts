import {Pipe, PipeTransform} from '@angular/core';
import 'rxjs/add/operator/map';

@Pipe({
  name: 'search'
})
export class SearchPipe implements PipeTransform {

  transform(actors, value) {
    return actors.getActors();
  }
}
