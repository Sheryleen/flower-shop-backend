package com.flowershop.backend.flowers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //indicates this will be a controller file
@CrossOrigin
@RequestMapping("/flowers") //maps this controller to a route prefix
//localhost:8080/flowers
public class FlowersController {

 //declares the instance of the service class
    @Autowired
    private final FlowersService flowersService;

    public FlowersController(FlowersService flowersService) {
        this.flowersService = flowersService;
    }

    //create all the route handler methods
    //to manage data (getAll, getOne, addOne, updateOne, removeOne, etc.)
    //indicates which HTTP method thisroute will look for

    @GetMapping
    public List<Flower> getAllFlowers() {
        return this.flowersService.getAllFlowers();
    }

    @GetMapping("/{id}")
    public Flower getOneFlower(@PathVariable int id) {
        Flower flower = flowersService.getOneFlower(id).orElseThrow(IllegalArgumentException::new);
        return flower;
    }

    @PostMapping
    public Flower addOneFlower(@RequestBody Flower newFlower) {
//        if(newFlower.getName() == null) {
//            throw new IllegalArgumentException("Not all fields are valid. Go back and make sure all fields are valid " +
//                    "before API call is made.");
//        }
        return flowersService.addOneFlower(newFlower);
    }

    @PatchMapping
    //localhost:8080/flowers
    public Flower updateOneFlower(@RequestBody Flower updatedFlower) {
        Flower flower = flowersService.getOneFlower(updatedFlower.getId()).orElseThrow(IllegalArgumentException::new);
        return flowersService.updateOneFlower(updatedFlower);
    }

    @DeleteMapping("/{id}")
    //localhost:8080/flowers/id
    //localhost:8080/flowers/1
    public String removeOneFlower(@PathVariable int id) {
        Flower flower = flowersService.getOneFlower(id).orElseThrow(IllegalArgumentException::new);
        return flowersService.removeOneFlower(id);
    }
}