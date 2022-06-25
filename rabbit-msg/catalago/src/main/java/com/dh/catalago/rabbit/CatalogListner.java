package com.dh.catalago.rabbit;


import com.dh.catalago.entity.Catalago;
import com.dh.catalago.service.impl.CatalagoServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class CatalogListner {

    private final CatalagoServiceImpl catalagoService;

    @RabbitListener(queues = {"${queue.catalago.name}"})
    public void receberMenssagem(Catalago catalago){
        catalagoService.save(catalago);
    }
}
