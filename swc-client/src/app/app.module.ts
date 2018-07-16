import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppComponent} from './app.component';
import {ActorComponent} from './actor/actor.component';
import {HttpModule} from '@angular/http';
import {HoverDirective} from './hover.directive';
import {FormsModule} from '@angular/forms';
import {SearchPipe} from './search.pipe';


@NgModule({
  declarations: [
    AppComponent,
    ActorComponent,
    HoverDirective,
    SearchPipe
  ],
  imports: [
    BrowserModule,
    HttpModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
