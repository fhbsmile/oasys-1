package cn.gson.oasys.model.dao.informdao;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import cn.gson.oasys.model.entity.notice.NoticesList;

public interface InformDao extends PagingAndSortingRepository<NoticesList, Long> {
	
	List<NoticesList> findByUserId(Long userId);

}
