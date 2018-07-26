import {Component} from '@angular/core';
import {ActorsService} from './actors.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  providers: [ActorsService]
})
export class AppComponent {

  actors;
  searchName = '';
  constructor(private actorsService: ActorsService) {
    this.actorsService.getActors().subscribe(actors => {
      this.actors = actors;
    });
  }
}
