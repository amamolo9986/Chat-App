package com.coderscampus.assignment14.service;

import java.nio.channels.Channel;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderscampus.assignment14.repository.ChannelRepository;

@Service
public class ChannelService {
	
	@Autowired
	private ChannelRepository channelRepo;

	public List<Channel> findAll() {
		return channelRepo.findAll();
	}

}