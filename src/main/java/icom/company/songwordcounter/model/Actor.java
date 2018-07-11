package icom.company.songwordcounter.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

@Data
@Document
public class Actor {

	Long id;
	String name;
	Set<Song> songs;

}
