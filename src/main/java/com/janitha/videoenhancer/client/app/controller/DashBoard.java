package com.janitha.videoenhancer.client.app.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class DashBoard extends BaseController{

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



}
