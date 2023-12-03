package com.ws.workspace.controller;
import com.ws.workspace.models.Offer;
import com.ws.workspace.services.GenriqueService;
import com.ws.workspace.services.OfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/offer")
public class OfferController extends AbstractController<Offer> {

    @Autowired
    private OfferService offerService;
    @Override
    protected GenriqueService<Offer> genriqueService() {
        return offerService;
    }
}
