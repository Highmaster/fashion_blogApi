package com.example.api.Services;import com.example.api.DTO.LikeRequestDto;public interface LikeService {    LikeRequestDto likes(Long id,LikeRequestDto likeRequestDto,String email);}