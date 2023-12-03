package com.ws.workspace.models;

import com.ws.workspace.models.dto.AbstarctEntity;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Offer extends AbstarctEntity {
    private String title;
    private String description;
}
