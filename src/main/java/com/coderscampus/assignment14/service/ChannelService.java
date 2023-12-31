package com.coderscampus.assignment14.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderscampus.assignment14.domain.Channel;
import com.coderscampus.assignment14.repository.ChannelRepository;

@Service
public class ChannelService {
	
	@Autowired
	private ChannelRepository channelRepo;

	public List<Channel> findAll() {
		return channelRepo.findAll();
	}

	public Channel findById(Long channelId) {
		return channelRepo.findById(channelId);
	}

}
