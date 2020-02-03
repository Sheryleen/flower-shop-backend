package com.flowershop.backend.flowers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service //indicates this class is a service
public class FlowersService {

    //declares an instance of the repository interface
    @Autowired
    private final FlowersRepository flowersRepository;

    //create all methods required to manage data

    public FlowersService(FlowersRepository flowersRepository){
    this.flowersRepository = flowersRepository;
}
    public List<Flower> getAllFlowers() {
        return this.flowersRepository.findAll();
    }

    public Optional<Flower> getOneFlower(int id) {
        return flowersRepository.findById(id);
    }

    public Flower addOneFlower(Flower newFlower) {
        return flowersRepository.save(newFlower);
    }

    public Flower updateOneFlower(Flower updatedFlower) {
        return flowersRepository.save(updatedFlower);
    }

    public String removeOneFlower(int id) {
        flowersRepository.deleteById(id);
        return "Id " + id + " was removed";
    }
}