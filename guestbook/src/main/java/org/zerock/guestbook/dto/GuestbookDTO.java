package org.zerock.guestbook.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GuestbookDTO {

    private Long gno;

    private String title;

    private String content;

    private String writer;

    private LocalDateTime modDate, regDate;

}
