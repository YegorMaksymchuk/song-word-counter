import {Component, Input, OnInit} from '@angular/core';

@Component({
  selector: 'app-actor',
  templateUrl: './actor.component.html',
  styleUrls: ['./actor.component.css']
})
export class ActorComponent implements OnInit {
  @Input() actor;

  isSelected = false;

  constructor() {
  }

  ngOnInit() {
  }

  onClick() {
    this.isSelected = true;
    console.log(this.actor.name + ' selected');
  }

}
