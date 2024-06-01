package com.springJpa.springJpa.Entity;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@AttributeOverrides({
        @AttributeOverride(
                name = "Name",
                column = @Column(name = "guardian_name")
        ),
        @AttributeOverride(
                name = "Mobile",
                column = @Column(name = "guardian_mobile")
        ),
        @AttributeOverride(
                name = "Email",
                column = @Column(name = "guardian_email")
        )}
)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Guardian {
    private String Name;
    private String Mobile;
    private String Email;
}
