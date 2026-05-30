package example.myRESTAPIs.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


    @Data
    public class AddStudentRequestDto {
        @NotBlank(message = "Name is required")
        private String name;

        @Email
        private String email;
    }

