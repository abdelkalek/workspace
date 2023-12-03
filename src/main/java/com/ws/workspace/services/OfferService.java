package com.ws.workspace.services;

import com.ws.workspace.models.Offer;
import com.ws.workspace.repository.OfferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class OfferService implements GenriqueService<Offer> {

    @Autowired
    private OfferRepository offerRepository;
    @Override
    public List<Offer> getAll() {
        return this.offerRepository.findAll();
    }

    @Override
    public Page<Offer> getPage(Pageable pageable) {
        return null;
    }

    @Override
    public Optional<Offer> findOne(UUID id) {
        return this.offerRepository.findById(id);
    }

    @Override
    public Offer AddOne(Offer offer) {
        return this.offerRepository.save(offer);
    }

    @Override
    public Offer update(Offer offer) {
        return this.offerRepository.save(offer);
    }

    @Override
    public void deleteById(UUID id) {
        this.offerRepository.deleteById(id);
    }


}
