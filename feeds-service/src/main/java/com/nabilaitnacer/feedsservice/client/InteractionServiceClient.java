package com.nabilaitnacer.feedsservice.client;

import com.nabilaitnacer.feedsservice.dto.CompletReaction;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "reaction-service")
public interface InteractionServiceClient {

    @GetMapping("/reaction-service/reaction/{postId}")
    List<CompletReaction> getReactionsByPostId(Long postId);
    //Todo check if working with reaction service

}
