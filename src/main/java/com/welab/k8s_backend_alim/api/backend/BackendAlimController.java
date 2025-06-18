package com.welab.k8s_backend_alim.api.backend;

import com.welab.k8s_backend_alim.common.dto.ApiResponseDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(value = "/backend/alim/v1", produces = MediaType.APPLICATION_JSON_VALUE)
public class BackendAlimController {
    @GetMapping("/hello")
    public ApiResponseDto<String> hello() {
        return ApiResponseDto.createOk("hello world from  alim service");
    }
}
