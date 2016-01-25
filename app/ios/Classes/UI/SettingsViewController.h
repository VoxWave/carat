//
//  SettingsViewController.h
//  Carat
//
//  Created by Jonatan C Hamberg on 22/01/16.
//  Copyright © 2016 University of Helsinki. All rights reserved.
//

#import "BaseViewController.h"

@interface SettingsViewController : BaseViewController

@property (retain, nonatomic) IBOutlet UILabel *mobileNetworkType;
@property (retain, nonatomic) IBOutlet UILabel *batteryState;
@property (retain, nonatomic) IBOutlet UILabel *cpuUsage;

@end