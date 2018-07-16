package com.company.songwordcounter.service.impl;


import com.company.songwordcounter.dto.Report;
import com.company.songwordcounter.model.Actor;
import com.company.songwordcounter.model.Song;
import com.company.songwordcounter.service.SparkService;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.sql.SparkSession;
import org.springframework.stereotype.Service;
import scala.Tuple2;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

@Service("sparkService")
public class SparkServiceImpl implements SparkService {

	@Override
	public List<Song> getSongs(Actor actor) {
		return null;
	}

	@Override
	public Report findCoincidence(Actor firstActor, Actor secondActor) {
		return null;
	}

	@Override
	public Report findCoincidence(List<Actor> actors) {
		return null;
	}
}
