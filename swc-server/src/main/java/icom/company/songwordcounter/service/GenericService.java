package icom.company.songwordcounter.service;

import java.util.List;

public interface GenericService<T, Long> {

	T save(T t);

	T remove(Long id);

	T update(Long id, T t);

	T getOne(Long id);

	List<T> getAll();

}
