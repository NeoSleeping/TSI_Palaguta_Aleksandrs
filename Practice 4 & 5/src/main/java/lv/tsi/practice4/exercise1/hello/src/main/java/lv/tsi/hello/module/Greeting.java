package lv.tsi.hello.module;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Greeting {
    private String content;
}
