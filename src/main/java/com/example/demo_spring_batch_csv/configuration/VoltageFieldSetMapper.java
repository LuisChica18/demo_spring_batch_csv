package com.example.demo_spring_batch_csv.configuration;

import com.example.demo_spring_batch_csv.model.Voltage;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;

public class VoltageFieldSetMapper implements FieldSetMapper<Voltage> {

    @Override
    public Voltage mapFieldSet(FieldSet fieldSet) {
        final Voltage voltage = new Voltage();

        voltage.setVolt(fieldSet.readBigDecimal("volt"));
        voltage.setTime(fieldSet.readDouble("time"));
        return voltage;

    }
}
