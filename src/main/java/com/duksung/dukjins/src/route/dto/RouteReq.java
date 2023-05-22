package com.duksung.dukjins.src.route.dto;

import com.duksung.dukjins.domain.RouteStatus;
import lombok.Getter;

@Getter
public class RouteReq {
    private Long memberId;
    private String startPoint;
    private String endPoint;
    private String routeName;
    private RouteStatus status;
    private int mark;
    private int good;
    private float pointX;
    private float pointY;
}
