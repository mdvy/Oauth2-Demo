package ru.medov.oath2string6.Util;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorResponseMessage {
    String message;
    LocalDateTime timestamp;
}
