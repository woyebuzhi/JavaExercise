#!/usr/bin/python3
# -*- coding: utf-8 -*-

import unittest
import sys
sys.path.append('../')
from test.page.BaiduPage import BaiduPage
from test.testcase.case_modle import *
from test.common.BrowserDriver import BrowserDriver

class BaiduCase(model):

    def test_baidu1(self):
        baidu = BaiduPage(self.driver)
        baidu.input_baidu_text('selenium')
        # self.assertEqual('selenium','')
        baidu.click_baidu_btn()
        baidu.get_screent_img("baidu")
        # self.assertIn('selenium',self.driver.title)

