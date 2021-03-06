package com.myfb.postservice.service;

import com.myfb.postservice.client.ClientDTO;
import com.myfb.postservice.dto.PostDTO;

import java.util.List;

public interface PostService {
     PostDTO createPost(PostDTO postDTO);
     PostDTO getPostDetail(Long postId);
     List<PostDTO> getAllPostByUser(Long userId);
     ClientDTO[] getAllCommentsForPostId(Long postId);

}