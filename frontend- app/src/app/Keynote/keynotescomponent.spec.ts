import { ComponentFixture, TestBed } from '@angular/core/testing';

import { keynotesComponent } from './keynotes.component';

describe('keynotesComponent', () => {
  let component: keynotesComponent;
  let fixture: ComponentFixture<keynotesComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [keynotesComponent]
    });
    fixture = TestBed.createComponent(keynotesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
