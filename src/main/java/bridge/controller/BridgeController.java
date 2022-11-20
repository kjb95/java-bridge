package bridge.controller;

import bridge.model.dto.MoveResultDto;
import bridge.model.service.BridgeService;
import bridge.view.InputView;
import bridge.view.OutputView;

public class BridgeController {

    private final BridgeService bridgeService = new BridgeService();
    private final InputView inputView = new InputView();
    private final OutputView outputView = new OutputView();

    public void run() {
        createBridge();
        move();
    }

    private void createBridge() {
        int bridgeSize = inputView.readBridgeSize();
        bridgeService.createBridge(bridgeSize);
    }

    private void move() {
        String bridgeType = inputView.readMoving();
    }

}
