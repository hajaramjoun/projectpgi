import { TestBed } from '@angular/core/testing';

import { PatientDateService } from './patient-date.service';

describe('PatientDateService', () => {
  let service: PatientDateService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(PatientDateService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
