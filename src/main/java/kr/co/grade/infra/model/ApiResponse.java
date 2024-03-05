package kr.co.grade.infra.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Collections;
import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApiResponse<T> {
    private Status status;
    private MetaData metadata;
    private List<T> results;

    public static <T> ApiResponse<T> error(Status status) {
        return ApiResponse.<T>builder()
                .status(status)
                .metadata(new MetaData(0))
                .results(Collections.emptyList())
                .build();
    }

    public static <T> ApiResponse<T> makeResponse(List<T> data) {
        MetaData metadata = new MetaData(data.size());
        Status status = new Status(ErrorCode.SUCCESS_VALUE);

        return ApiResponse.<T>builder()
                .status(status)
                .metadata(metadata)
                .results(data)
                .build();
    }
}