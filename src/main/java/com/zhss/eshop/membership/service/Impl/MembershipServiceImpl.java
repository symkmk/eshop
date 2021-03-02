package com.zhss.eshop.membership.service.Impl;


import com.zhss.eshop.membership.domain.dto.MembershipUserAccountDTO;
import com.zhss.eshop.membership.service.MembershipService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 会员中心对外接口service组件
 * @author zhonghuashishan
 *
 */
@Service
public class MembershipServiceImpl implements MembershipService {

	private static final Logger logger = LoggerFactory.getLogger(
			MembershipServiceImpl.class);


	@Override
	public Boolean informFirstLoginDailyEvent(Long userAccountId) {
		return null;
	}

	@Override
	public Boolean informPayOrderEvent(Long userAccountId, Double totalOrderAmount) {
		return null;
	}

	@Override
	public Boolean informFinishReturnGoodsEvent(Long userAccountId, Double totalOrderAmount) {
		return null;
	}

	@Override
	public Boolean informPublishCommentEvent(Long userAccountId, Boolean showPictures) {
		return null;
	}

	@Override
	public Boolean informRemoveCommentEvent(Long userAccountId, Boolean showPictures) {
		return null;
	}

	@Override
	public List<MembershipUserAccountDTO> listAllUserAccounts() {
		return null;
	}
}
