package com.ws.workspace.repository;
import com.ws.workspace.models.Offer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;
@Repository
public interface OfferRepository extends JpaRepository<Offer, UUID> {
   // Page<Offer> findAll(Pageable pageable);
}