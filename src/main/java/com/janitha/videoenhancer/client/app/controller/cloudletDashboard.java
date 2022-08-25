package com.janitha.videoenhancer.client.app.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.janitha.videoenhancer.client.domain.services.plugInManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class cloudletDashboard extends BaseController{

    /*
    @Autowired
    cloudletManager cloudletManagerObj;

    @GetMapping("/getAvailableCloudlets")
    public String getAvailableCloudlets() throws JsonProcessingException {
        String strCloudletes = "";
        List<CloudletInfo> cloudletInfoList = cloudletManagerObj.getAllCloudlets();
        for (CloudletInfo temp : cloudletInfoList) {
            strCloudletes = strCloudletes.concat(temp.getItemDetails());
        }
        return strCloudletes;
    }

    @Autowired
    cloudletRepository cloudletRepo;
    @GetMapping("/create")
    public void index2() {
        System.out.println("Data creation started...");
        cloudletRepo.save(new CloudletInfo("1", "janitha", "192.323", ""));
        cloudletRepo.save(new CloudletInfo("2", "janitha", "192.323", "jani"));
        System.out.println("Data creation complete...");

    }

    @Autowired gcpPubSubManager gcpPubSubManagerObj;

    @Autowired
    private ServerApplication.PubsubOutboundGateway messagingGateway;
    // end::autowireGateway[]


    @GetMapping("/publishMessage/{message}")
    public RedirectView publishMessage(@PathVariable("message") String message) {
        messagingGateway.sendToPubsub(message);
        return new RedirectView("/");
    }
*/
    @Autowired
    plugInManager plugInManagerObj;

    @GetMapping("/getAvailablePlugins")
    public String getAvailableCloudlets() throws IOException {
        String strCloudletes = "";
        plugInManagerObj.populatePluIngs();

        return strCloudletes;
    }

}