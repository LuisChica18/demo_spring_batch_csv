package com.example.demo_spring_batch_csv.configuration;

import com.example.demo_spring_batch_csv.model.Voltage;
import org.springframework.batch.item.ItemProcessor;

import java.math.BigDecimal;

public class VoltageProcessor implements ItemProcessor<Voltage, Voltage> {

    @Override
    public Voltage process(Voltage voltage) throws Exception {
        final BigDecimal volt = voltage.getVolt();
        final double time = voltage.getTime();

        if (volt.compareTo(BigDecimal.valueOf(5)) > 0) {
            final Voltage processedVoltage = new Voltage();
            processedVoltage.setVolt(volt);
            processedVoltage.setTime(time);
            return processedVoltage;
        }
        return null;
    }
}
