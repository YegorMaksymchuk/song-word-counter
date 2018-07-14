package com.company.songwordcounter.dto;

import com.company.songwordcounter.model.Actor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Report {
	private Actor firstActor;
	private Actor secondActor;
	private Double percentOfCoincidence;
}
