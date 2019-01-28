import { Component, OnInit } from '@angular/core';
import { DogService } from '../dog.service';

@Component({
  selector: 'app-dog',
  templateUrl: './dog.component.html',
  styleUrls: ['./dog.component.css']
})
export class DogComponent implements OnInit {

  
  constructor(private dogService: DogService) { }

  ngOnInit() {
  }

  /**
   * Using the DogService to get an Observable back
   * We must .subscribe to this with the argument being
   * a CALLBACK FUNCTION!!
   */
  getDog() {
    this.dogService.getRandomDog().subscribe( (e)=>{
      this.imgUrl = e.message;
    })
  }

}
